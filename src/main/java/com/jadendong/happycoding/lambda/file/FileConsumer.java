package com.jadendong.happycoding.lambda.file;

/**
 * @author jaden dong
 */
@FunctionalInterface
public interface FileConsumer {

    /**
     * 函数式接口抽象方法
     *
     * @param fileContent - 文件内容字符串
     */
    void fileHandler(String fileContent);
}