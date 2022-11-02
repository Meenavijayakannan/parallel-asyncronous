package com.learnjava;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFunctions {
    public static void main(String args[]){
        //Streams will return a generic type of stream
        Stream<Integer> streams = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.skip(2).forEach(System.out::println);
        streams.limit(2).forEach(System.out::println);


    }
}
