                       comando = "";
        }

        if (logado == null && !uri.equals(path+"/Login.jsp") && !comando.equals("FazerLogin")) {
        if (logado == null && !uri.equals(path+"/Login.jsp") && !comando.equals("FazerLogin") && !uri.equals(path+"/Cadsatro.jsp") && !comando.equals("Cadastrar")) {
            ((HttpServletResponse) response).sendRedirect(path + "/Login.jsp");
        } else {
            chain.doFilter(request, response);
