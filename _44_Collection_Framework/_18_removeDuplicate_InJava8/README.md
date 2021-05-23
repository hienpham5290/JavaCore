# Loại Bỏ Phần Tử Trùng Lặp<br/>Trong Java 8
* ngoài cách loại bỏ các phần tử trùng lặp trong ArrayList từ Java 7 trở<br/>
xuống.
  
* ta có thể sử dụng 1 số tính năng của Java 8 để thực hiện hành động này.

## Nội Dung
1. [Sử dụng phương thức distinct() trong Stream API](#1)
2. [Sử dụng phương thức removeIf()](#2)
3. [Sử dụng phương thức collect() với Collectors.Collection](#3)

### 1. Sử dụng phương thức distinct() trong Stream API <a id="1"></a>
* method **distinct()** trả về 1 **Stream** gồm các phần tử duy nhất, nó sử dụng<br/>
method **Object.equals(Object)** để so sánh và tìm ra phần tử trùng lặp.
  
* đối với ordered Stream (luồng có thứ tự) thì đảm bảo tính ổn định (stable) <br/>
  của các phần tử: đối với các phần tử trùng lặp, phần tử xuất hiện đầu tiên<br/>
  trong vùng chứa phần tử trùng lặp được giữ nguyên.
  
* đối với unordered Stream (luồng không có thứ tự) thì không đảm bảo tính<br/>
ổn định (stable) thứ tự của các phần tử
  
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01_distinct_method {
    public static void main(String[] args) {
        List<String> listWithDuplicate = new ArrayList<>();
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("ANDROID");
        listWithDuplicate.add("JAVA");

        List<String> listWithoutDuplicate = listWithDuplicate
                .stream() // đưa vào stream
                .distinct() // return stream các phần tử không trùng lặp
                .collect(Collectors.toList()); // truyền vào List

        System.out.println(listWithoutDuplicate);
    }
}
```
```
OUTPUT
[JAVA, J2EE, ANDROID]
```
### 2. Sử dụng phương thức removeIf() <a id="2"></a>
* method removeIf() chấp nhận đối số là 1 Predicate, nó loại bỏ tất cả các<br/>
phần tử của Collection thỏa mãn điều kiện đã cho.
  
* ý tưởng sử dụng method này là lợi dụng tính năng không chứa phần tử <br/>
trùng lặp của HashSet và LinkedHashSet để kiểm tra sự tồn tại loại bỏ<br/>
  phần tử trùng lặp
  
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_removeIf_method {
    public static void main(String[] args) {
        List<String> listWithDuplicate = new ArrayList<>();
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("ANDROID");
        listWithDuplicate.add("JAVA");

        Set<String> elementsAlreadySeen = new HashSet<>();
        listWithDuplicate.removeIf(s -> !elementsAlreadySeen.add(s));

        System.out.println(elementsAlreadySeen);
    }
}
```
```
OUTPUT
[JAVA, J2EE, ANDROID]
```
### 3. Sử dụng phương thức collect() với Collectors.Collection <a id="3"></a>
* method **collect()** chấp nhận đối số là 1 **Collector**.
* trong Java 8 chúng ta có thể sử dụng method **Collectors.toCollection()**<br/>
để tạo ra Collector. phương thức này sử dụng 1 đối số là **Supplier**.
* cách thức thực hiện là lợi dụng tính năng không chứa phần tử trùng lặp<br/>
của HashSet, LinkedHashSet hoặc TreeSet.
  
* ví dụ loại bỏ các sinh viên có cùng email với TreeSet
```java
import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + " - email=" + email + " ]";
    }
}

public class _03_collect_method {
    public static void main(String[] args) {
        List<Student> studentsWithDuplicate = new ArrayList<>();
        studentsWithDuplicate.add(new Student("Nguyen Nhat", "nguyennhat@gmail.com"));
        studentsWithDuplicate.add(new Student("Le Van", "levan@gmail.com"));
        studentsWithDuplicate.add(new Student("Tran Khoa", "trankhoa@gmail.com"));
        studentsWithDuplicate.add(new Student("Le Vo", "levan@gmail.com"));
        studentsWithDuplicate.add(new Student("Ly Nguyen", "lynguyen@gmail.com"));

        Set<Student> studentsWithoutDuplicate = studentsWithDuplicate
                .stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getEmail))));

        studentsWithoutDuplicate.forEach(s -> System.out.println(s));
    }
}
```
```
OUTPUT
Student [name=Le Van - email=levan@gmail.com ]
Student [name=Ly Nguyen - email=lynguyen@gmail.com ]
Student [name=Nguyen Nhat - email=nguyennhat@gmail.com ]
Student [name=Tran Khoa - email=trankhoa@gmail.com ]
```

* trong thực tế, method **distinct()** thường được sử dụng nhiều hơn để<br/>
loại bỏ phần tử trùng lặp.
  
* sử dụng **removeIf()** hay **collect()** không tốt về performance, đồng thời<br/>
nó trả về 1 **Set**, khi đó ta phải chuyển nó sang **List**.
  
* tuy nhiên trong 1 số trường hợp vẫn có thể sử dụng **removeIf()** hoặc<br/>
**collect()** sẽ mang lại hiệu năng tốt hơn.