# Score Analyzer - GitHub Flow Version

Project Java mẫu để nộp bài với yêu cầu:
- Có ít nhất 1 vòng lặp và 1 lệnh rẽ nhánh
- Đưa code lên GitHub repo
- Tạo 2 issue về JUnit test
- Giải quyết từng issue trên từng nhánh riêng
- Tạo commit tương ứng
- Mở pull request về `main`

## Cấu trúc nhánh đề xuất

- `main`: nhánh ổn định
- `feature/base-program`: thêm chương trình ban đầu
- `feature/issue-1-statement-coverage`: giải quyết issue 1
- `feature/issue-2-path-coverage`: giải quyết issue 2

## Chạy chương trình

```bash
mvn clean test
mvn -q exec:java -Dexec.mainClass="com.example.demo.ScoreAnalyzer"
```

Hoặc dùng `javac` / `java`:

```bash
javac -d out src/main/java/com/example/demo/ScoreAnalyzer.java
java -cp out com.example.demo.ScoreAnalyzer
```

## Kết quả mong đợi

```text
ALL_PASS
ALL_FAIL
MIXED
```

## Quy trình GitHub Flow

### 1. Tạo repo và đẩy code ban đầu

```bash
git init
git branch -M main
git add .
git commit -m "chore: initialize Maven Java project"

git checkout -b feature/base-program
git add src/main/java/com/example/demo/ScoreAnalyzer.java README.md pom.xml
git commit -m "feat: add ScoreAnalyzer with loop and branching"
```

Mở PR từ `feature/base-program` vào `main`, merge xong thì cập nhật `main`.

### 2. Tạo issue 1 và giải quyết trên nhánh riêng

```bash
git checkout main
git pull
git checkout -b feature/issue-1-statement-coverage
```

Viết test bao phủ tất cả các lệnh, rồi commit:

```bash
git add src/test/java/com/example/demo/ScoreAnalyzerStatementCoverageTest.java
git commit -m "test: add statement coverage tests for ScoreAnalyzer"
```

Mở PR vào `main` và merge.

### 3. Tạo issue 2 và giải quyết trên nhánh riêng

```bash
git checkout main
git pull
git checkout -b feature/issue-2-path-coverage
```

Viết test bao phủ các đường đi, rồi commit:

```bash
git add src/test/java/com/example/demo/ScoreAnalyzerPathCoverageTest.java
git commit -m "test: add path coverage tests for ScoreAnalyzer"
```

Mở PR vào `main` và merge.

## Gợi ý nội dung Pull Request

### PR 1
- Title: Add base ScoreAnalyzer program
- Body: Add initial Java program containing a loop and branching logic.

### PR 2
- Title: Add statement coverage tests
- Body: Resolve issue #1 by adding JUnit tests to cover all statements.

### PR 3
- Title: Add path coverage tests
- Body: Resolve issue #2 by adding JUnit tests to cover all execution paths.
