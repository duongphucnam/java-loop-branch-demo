# Issue 2: Viết các ca kiểm thử JUnit để bao phủ tất cả các đường đi

## Mô tả
Viết các ca kiểm thử JUnit cho lớp `ScoreAnalyzer` để bao phủ các đường đi hữu hạn tiêu biểu trong vòng lặp và các nhánh quyết định của phương thức `analyze`.

## Các đường đi cần bao phủ
- Phần tử đầu pass, phần tử sau pass -> `ALL_PASS`
- Phần tử đầu fail, phần tử sau fail -> `ALL_FAIL`
- Phần tử đầu pass, phần tử sau fail -> `MIXED`
- Phần tử đầu fail, phần tử sau pass -> `MIXED`

## Điều kiện hoàn thành
- Sử dụng JUnit 5
- `mvn test` chạy thành công
