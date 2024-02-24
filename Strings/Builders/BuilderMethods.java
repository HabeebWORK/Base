package Base.Strings.Builders;

import java.util.Scanner;

public class BuilderMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            System.out.println("Select an operation to perform:");
            System.out.println("1. Append String");
            System.out.println("2. Append Char");
            System.out.println("3. Insert String");
            System.out.println("4. Insert Char");
            System.out.println("5. Delete");
            System.out.println("6. Delete Char");
            System.out.println("7. Replace");
            System.out.println("8. Reverse");
            System.out.println("9. Get Length");
            System.out.println("10. Get Character at Index");
            System.out.println("11. Convert to String");
            System.out.println("12. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter string to append:");
                    String str = scanner.nextLine();
                    sb.append(str);
                    break;
                case 2:
                    System.out.println("Enter character to append:");
                    char c = scanner.next().charAt(0);
                    sb.append(c);
                    break;
                case 3:
                    System.out.println("Enter string to insert:");
                    String insStr = scanner.nextLine();
                    System.out.println("Enter index to insert at:");
                    int index = scanner.nextInt();
                    sb.insert(index, insStr);
                    break;
                case 4:
                    System.out.println("Enter character to insert:");
                    char insChar = scanner.next().charAt(0);
                    System.out.println("Enter index to insert at:");
                    int charIndex = scanner.nextInt();
                    sb.insert(charIndex, insChar);
                    break;
                case 5:
                    System.out.println("Enter start index to delete:");
                    int start = scanner.nextInt();
                    System.out.println("Enter end index to delete:");
                    int end = scanner.nextInt();
                    sb.delete(start, end);
                    break;
                case 6:
                    System.out.println("Enter index to delete:");
                    int delIndex = scanner.nextInt();
                    sb.deleteCharAt(delIndex);
                    break;
                case 7:
                    System.out.println("Enter start index to replace:");
                    int startReplace = scanner.nextInt();
                    System.out.println("Enter end index to replace:");
                    int endReplace = scanner.nextInt();
                    System.out.println("Enter string to replace with:");
                    String replaceStr = scanner.nextLine();
                    sb.replace(startReplace, endReplace, replaceStr);
                    break;
                case 8:
                    sb.reverse();
                    break;
                case 9:
                    System.out.println("Length of StringBuilder: " + sb.length());
                    break;
                case 10:
                    System.out.println("Enter index to get character at:");
                    int charIndexGet = scanner.nextInt();
                    char charAtIndex = sb.charAt(charIndexGet);
                    System.out.println("Character at index " + charIndexGet + ": " + charAtIndex);
                    break;
                case 11:
                    System.out.println("StringBuilder as String: " + sb.toString());
                    break;
                case 12:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println("StringBuilder content: " + sb);
        }
    }
}

