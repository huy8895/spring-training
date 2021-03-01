import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationExample {
    public static void main(String[] args) {
        Class<User> clazz = User.class;
        Annotation[] annotation1 = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotation1) {
            Class<? extends Annotation> aClass = annotation.annotationType();
            System.out.println("aClass = " + aClass.getName());
            System.out.println("annotation = " + annotation);
            String name = ((MyAnnotation) annotation).name();
            System.out.println("name = " + name);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
//            field.setAccessible(true);
            MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
            String name = annotation.name();
            System.out.println("name = " + name);

        }
    }
}
