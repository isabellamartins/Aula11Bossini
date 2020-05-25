  @Override
    public void executar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            throws Exception {

        String nome = request.getParameter("username");
        String senha = request.getParameter("passwd");
