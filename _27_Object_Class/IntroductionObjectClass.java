package _27_Object_Class;
/**
 * Lớp Object trong Java
 * _________________________________________________________________________________________________________________________
 * mặc định lớp Object là superclass của tất cả các lớp trong Java ( là lớp cao nhất trong Java )
 *
 * nghĩa là khi 1 lớp được tạo ra, nó mặc định kế thừa lớp Object, nó chỉ dừng kế thừa lớp Object
 * khi nó kế thừa 1 lớp nào đó khác, khi đó lớp mà nó kế thừa sẽ kế thừa lớp Object
 *
 * tóm lại: Object luôn là lớp cao nhất, là lớp cha của tất cả các lớp trong Java
 *
 * vì là superclass cao nhất, nên những phương thức của lớp Object, các lớp khác trong Java đều
 * sử dụng được ( bằng cách override )
 * _________________________________________________________________________________________________________________________
 * CÁC PHƯƠNG THỨC CỦA CLASS OBJECT
 * _________________________________________________________________________________________________________________________
 *
 * protected Object clone() throws CloneNotSupportedException ------------- [tạo và trả về bản sao chép (clone) của đối tượng hiện tại.]
 *
 * public final Class getClass() ------------[trả về đối tượng lớp Class của đối tượng hiện tại. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.]
 *
 * public int hashCode() ---------- [trả về số hashcode cho đối tượng hiện tại.]
 *
 * public boolean equals(Object obj) --------- [so sánh đối tượng đã cho với đối tượng hiện tại.]
 *
 * public String toString() ----------- [trả về chuỗi ký tự đại diện của đối tượng hiện tại.]
 *
 * public final void notify() ---------- [đánh thức một luồng, đợi trình giám sát của đối tượng hiện tại.]
 *
 * public final void notifyAll() ---------- [đánh thức tất cả các luồng. đợi trình giám sát của đối tượng hiện tại.]
 *
 * public final void wait(long timeout)throws InterruptedException ---------- [ làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()). ]
 *
 * public final void wait(long timeout,int nanos)throws InterruptedException --------- [làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây và nano giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).]
 *
 * public final void wait()throws InterruptedException --------- [làm Thread hiện tại đợi, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).]
 *
 * protected void finalize()throws Throwable ----------- [Được gọi bởi Garbage Collector trước khi đối tượng bị dọn rác.]
 *
 * _________________________________________________________________________________________________________________________
 */
 public class IntroductionObjectClass {
    public static void main(String[] args) {
        Object obj = new Object();
    }
 }
