package com.identity.dPatterns.strategy;

import java.util.List;

/**
 * Created by ajkumar on 4/29/17.
 */
public class CompressionContext {
    private CompressionStrategy context = null;

    public CompressionContext(CompressionStrategy ctx){
        context = ctx;
    }

    public void createArchieve(List<String> files){
     context.compressFiles(files);
    }
}
