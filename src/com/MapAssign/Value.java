package com.MapAssign;

class Value {
    private String data;

    public Value(String data) {
        this.data = data;
    }

   @Override
   public String toString() {
       return "Value{" +
               "data='" + data + '\'' +
               '}';
   }
}