public class Main {
    public static void main(String[] args) {

        // Исходный текст
        String text = "Это просто тестовый текст, в котором есть плохие слова: дурак и балбес.";

        // Список запрещённых слов
        String[] bannedWords = {"дурак", "балбес"};

        // Проход по каждому запрещённому слову
        for (String banned : bannedWords) {

            // Заменяем слово на звездочки по длине
            String stars = "*".repeat(banned.length());

            // Делаем замену
            text = text.replaceAll("(?i)" + banned, stars);
        }

        System.out.println("Отфильтрованный текст:");
        System.out.println(text);
    }
}
