package com.giant.cloud.common.utils.http;

import javax.servlet.ServletOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterServletOutputStream extends ServletOutputStream {
    
    DataOutputStream output;
    
    public FilterServletOutputStream(OutputStream output) {
        this.output = new DataOutputStream(output);
    }
    
    @Override
    public void write(int arg0) throws IOException {
        output.write(arg0);
    }
    
    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        output.write(arg0, arg1, arg2);
    }
    
    @Override
    public void write(byte[] arg0) throws IOException {
        output.write(arg0);
    }
}
