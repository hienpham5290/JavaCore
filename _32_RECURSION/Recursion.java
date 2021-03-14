package _32_RECURSION;

/**
 * RECURSION - ĐỆ QUY
 *
 * Đệ quy ( Recursion ) là quá trình trong đó 1 phương thức gọi lại chính nó một cách liên tục, cho đến khi gặp điều kiện dừng sẽ trả về
 * kết quả ngược lại
 *
 * ĐỆ QUY CÓ 2 THÀNH PHẦN
 *       Phần cơ sỡ: là điều kiện thoát khỏi đệ quy, method đệ quy không thể gọi tới nó mãi, cần phải có 1 điểm dừng ( điểm neo ) tại 1 trường
 *       hợp đặc biệt, gọi là trường hợp suy biến ( degenerate case )
 *
 *       Phần đệ quy: thân hàm có chứa lời gọi đệ quy
 *
 * THIẾT KẾ GIẢI THUẬT ĐỆ QUY
 *      Để thiết kế giải thuật đệ quy thực hiện 3 bước sau:
 *          tham số hóa bài toán
 *          phân tích trường hợp chung: đưa bài toán về bài toán nhỏ hơn cùng loại, dần dần tiến tới trường hợp suy biến
 *          tìm trường hợp suy biến
 *
 * ƯU ĐIỂM & NHƯỢC ĐIỂM
 *      ƯU ĐIỂM: một số trường hợp giúp code gọn ràng, dễ hiểu, giảm độ phức tạp, đặc biệt trong việc giải quyết các vấn đề dựa trên cấu trúc cây.
 *      NHƯỢC ĐIỂM: không tối ưu về mặt thời gian (so với sử dụng vòng lặp), gây tốn bộ nhớ.
 *
 * MỘT SỐ DẠNG ĐỆ QUY
 *      Đệ quy tuyến tính (Linear Recursion): mỗi lần thực thi chỉ gọi đệ quy một lần.
 *          ví dụ: Bài toán tính giai thừa, Dãy Fibonaci.
 *      Đệ quy nhị phân (Binary Recursion): mỗi lần thực thi có thể gọi đệ quy 2 lần.
 *          ví dụ: Bài toán tháp Hà Nội, Tính tổ hợp chập K của N.
 *      Đệ quy lồng (Nested Recursion): tham số trong lời gọi đệ quy là một lời gọi đệ quy. Đệ quy lồng chiếm bộ nhớ rất nhanh
 *          ví dụ: Hàm số Ackermann.
 *      Đệ quy hỗ tương (Mutual Recursion): Các hàm gọi đệ quy lẫn nhau.
 *          ví dụ: Xét tính chẵn lẻ của một số nguyên dương bằng đệ quy.
 *      Quay lui (Backtracking):
 *          Trong lập trình, có một chiến lược giải bài toán một cách đầy đủ nhất, đảm bảo đủ mọi trường hợp bằng phương pháp Thử và Sai (Try and Error).
 *          Nét đặc trưng của phương pháp này là ở chỗ các bước đi đến lời giải hoàn toàn bằng cách làm thử.
 *          Nếu có một lựa chọn được chấp nhận thì ghi nhớ các thông tin cần thiết các bước thử tiếp theo.
 *          Trái lại, nếu không có một lựa chọn nào thích hợp thì làm lại bước trước, xoá bớt các ghi nhớ và quay về chu trình thử với các lựa chọn còn lại
 *          Hành động này được gọi là quay lui (Back tracking) và các giải thuật thể hiện phương pháp này gọi là các giải thuật quay lui.
 *          Việc quay lui để thử tất cả các tổ hợp có thể có để đạt được lời giải cuối cùng.
 *              ví dụ Bài toán N-Hậu (N-Queen).
 *
 */

public class Recursion {
    static int count = 0;
    public static void Welcome() {
        count++;
        if (count <= 100) { // điểm neo ( trường hợp suy biến - degenerate case ) đệ quy sẽ dừng khi gặp điều kiện này
            System.out.println(count + " " + "Welcome");
            Welcome(); // phần gọi đệ quy
        }
    }

    public static void main(String[] args) {
        Welcome();
    }
}
