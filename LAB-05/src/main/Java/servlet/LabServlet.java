package servlet;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Todo;
@WebServlet(
	    urlPatterns = "/ServletLab"
	)
public class LabServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Writer responseWriter = resp.getWriter();
        Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
        String stringId = optId.isPresent() && !optId.get().isEmpty() ? optId.get() : "";
       
        try
        {
        	int intId = Integer.parseInt(stringId);
            Todo todo = Service.getTodo(intId); 
            ArrayList<Todo> todoList = new ArrayList<Todo>();
            todoList.add(todo);
            responseWriter.write(Service.todosToHTMLTable(todoList));
            resp.setStatus(HttpServletResponse.SC_OK);
            responseWriter.flush();
        }
        catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        catch (Exception e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}   