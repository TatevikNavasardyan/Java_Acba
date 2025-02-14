package org.example.Generics;

class Gen<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

// Usage
//Box<String> stringBox = new Box<>();
//stringBox.set("Hello");
//String text = stringBox.get();
