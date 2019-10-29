package main.java;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

public class StatelessFactorizer implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(resp, factors);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    private BigInteger extractFromRequest(ServletRequest req) {
        return BigInteger.ONE;
    }

    private BigInteger[] factor(BigInteger i) {
        return new BigInteger[]{i};
    }

    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }
}
