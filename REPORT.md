# 課題2: リファクタリング2

## Points.javaの不吉な匂いと対策

可読性を高めるための論理の簡略化する：
public boolean pointExists(int x, int y) {
for (Point point : points) {
if (point.x == x && point.y == y) {
return true;
}
}
return false;
}

## MyAccountTest.javaの不吉な匂いと対策
入力の有効性を確保するために追加の条件チェックを追加する：

public void deposit(long delta) {
if (delta > 0) {
this.deposit += delta;
this.balance += delta;
} else {
System.out.println("Deposit amount must be greater than zero.");
}
}

public void withdraw(long delta) {
if (delta > 0 && delta <= this.balance) {
this.withdrawal += delta;
this.balance -= delta;
} else {
System.out.println("Invalid withdrawal amount.");
}
}

## Input.javaの不吉な匂いと対策

テストはしなっかたため、特にない
