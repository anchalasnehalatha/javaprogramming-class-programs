class Alpha{
Alpha(){
System.out.println("Alpha() constructor");
}
Alpha(int a){
this();
System.out.println("Alpha(int) constructor");
}
}
class Beta extends Alpha{
Beta();
super(10);
System.out.println("Beta() constructor");
}
}
public classs mainclass2{
public static void main(String[] args){
Beta b=new Beta();
}
}
