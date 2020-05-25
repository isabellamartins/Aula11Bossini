public interface Command {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
