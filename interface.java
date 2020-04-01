interface cars {
  public void model1(); 
  public void model2(); 
}

class benz implements cars {
  public void model1() {
    System.out.println("C CLASS");
  }
  public void model2() {
    System.out.println("E CLASS");
  }
}

class interfaces {
  public static void main(String[] args) {
    benz c = new benz();
    c.model1();
    c.model2();
  }
}
