
import java.io.IOException;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) throws IOException {


            System.out.println("������� ���������. ��������� � ���� ������ ���� ��������� ��������");
            System.out.println("��������� ��������� �������� � ������� �����");
            System.out.println("����� �� 0 �� 10 ������������ � �� I �� X ������������");

            try (Scanner sc = new Scanner(System.in)) {
                String result = new Calculator().calculate(sc.nextLine().trim().split(" "));
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("������� �������� ������ -_-");
            }

        }

    }

