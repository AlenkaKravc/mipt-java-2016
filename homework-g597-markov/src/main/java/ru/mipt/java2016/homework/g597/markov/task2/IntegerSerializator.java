package ru.mipt.java2016.homework.g597.markov.task2;

/**
 * Created by Alexander on 30.10.2016.
 */

import java.io.RandomAccessFile;
import java.io.IOException;

public class IntegerSerializator implements SerializationStrategy<Integer> {

    public IntegerSerializator() {}

    @Override
    public Integer read(RandomAccessFile fileName) throws IOException{
        return fileName.readInt();
    }

    @Override
    public void write(RandomAccessFile fileName, Integer data) throws IOException{
        fileName.writeInt(data);
    }
}
