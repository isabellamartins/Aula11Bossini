public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			request.setCharacterEncoding("UTF-8");
			Command comando = (Command) Class.forName("command." + request.getParameter("command")).newInstance();
@@ -25,11 +25,21 @@ protected void doExecute(HttpServletRequest request, HttpServletResponse respons
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request, response);
		try {
			doExecute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request, response);
		try {
			doExecute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
