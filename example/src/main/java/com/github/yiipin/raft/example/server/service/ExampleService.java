package com.github.yiipin.raft.example.server.service;

public interface ExampleService {

    ExampleProto.SetResponse set(ExampleProto.SetRequest request);

    ExampleProto.GetResponse get(ExampleProto.GetRequest request);
}
