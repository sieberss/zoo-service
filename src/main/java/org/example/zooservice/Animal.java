package org.example.zooservice;

import lombok.With;

@With
public record Animal(String id, String name, int age) {
}
