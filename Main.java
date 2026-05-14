import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameLibrary library = new GameLibrary("My Game Library");
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n==================================");
            System.out.println("        GAME LIBRARY        ");
            System.out.println("==================================");
            System.out.println("Games in library: " + library.listAllGames().size());
            System.out.println("==================================");

            System.out.println("1. Add Game");
            System.out.println("2. View All Games");
            System.out.println("3. Rate a Game");
            System.out.println("4. Filter by Genre");
            System.out.println("5. Filter by Platform");
            System.out.println("6. Filter by Age Rating");
            System.out.println("7. Add Game Session");
            System.out.println("8. View All Sessions");
            System.out.println("9. Top Rated Games");
            System.out.println("0. Exit");
            System.out.println("==================================");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();
            System.out.println();

            switch (choice) {

                case "1":
                    System.out.println("Choose Game Type:");
                    System.out.println("1. Single Player");
                    System.out.println("2. Multiplayer");
                    System.out.println("3. Online");
                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Game Size (MB): ");
                    double size = Double.parseDouble(scanner.nextLine());

                    System.out.print("Genre (ACTION / RPG / ADVENTURE): ");
                    Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());

                    System.out.print("Platform (PC / PLAYSTATION / XBOX): ");
                    Platform platform = Platform.valueOf(scanner.nextLine().toUpperCase());

                    System.out.print("Age Rating (E / T / M): ");
                    AgeRating rating = AgeRating.valueOf(scanner.nextLine().toUpperCase());

                    Game game = null;

                    if (type.equals("1")) {

                        System.out.print("Has Story Mode (true/false): ");
                        boolean story = Boolean.parseBoolean(scanner.nextLine());

                        System.out.print("Estimated Play Time (minutes): ");
                        int minutes = Integer.parseInt(scanner.nextLine());

                        Game baseGame = new Game(title, size, genre, platform, rating);

                        game = new SinglePlayer(
                            baseGame,
                            story,
                            minutes
                        );
                    }

                    
                    else if (type.equals("2")) {

                        System.out.print("Max Players: ");
                        int maxPlayers = Integer.parseInt(scanner.nextLine());

                        System.out.print("Local Multiplayer (true/false): ");
                        boolean local = Boolean.parseBoolean(scanner.nextLine());

                        game = new Multiplayer(
                            new Game(title, size, genre, platform, rating),
                            maxPlayers,
                            local
                        );
                    }

                
                    else if (type.equals("3")) {

                        System.out.print("Server Name: ");
                        String server = scanner.nextLine();

                        System.out.print("Requires Subscription (true/false): ");
                        boolean sub = Boolean.parseBoolean(scanner.nextLine());

                        game = new Online(
                            new Game(title, size, genre, platform, rating),
                            server,
                            sub
                        );
                    }

                    else {
                        System.out.println("Invalid game type.");
                        break;
                    }

                    library.addGame(game);
                    System.out.println("Game added successfully!");
                    break;

                case "2":

                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.println("\n==================================");
                    System.out.println("          ALL GAMES          ");
                    System.out.println("==================================");

                    int index = 1;

                    for (Game g : library.listAllGames()) {

                        String typeLabel;

                        if (g instanceof SinglePlayer) {
                            typeLabel = "Single Player";
                        } else if (g instanceof Multiplayer) {
                            typeLabel = "Multiplayer";
                        } else if (g instanceof Online) {
                            typeLabel = "Online";
                        } else {
                            typeLabel = "Base Game";
                        }

                        System.out.println("Game #" + index + " [" + typeLabel + "]");
                        System.out.println("----------------------------------");
                        System.out.println(g.toString());
                        System.out.println("----------------------------------\n");

                        index++;
                    }

                    break;

                case "3":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.print("Enter game title: ");
                    Game g = library.findGameByTitle(scanner.nextLine());

                    if (g != null) {
                        System.out.print("Enter rating (0 - 5): ");
                        double r = Double.parseDouble(scanner.nextLine());
                        g.addRating(r);
                    } else {
                        System.out.println("Game not found.");
                    }

                    break;

                case "4":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.print("Enter genre: ");
                    Genre gFilter = Genre.valueOf(scanner.nextLine().toUpperCase());
                    library.printGamesByGenre(gFilter);
                    break;

                case "5":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.print("Enter platform (PC / PLAYSTATION / XBOX): ");
                    Platform pFilter = Platform.valueOf(scanner.nextLine().toUpperCase());
                    library.printGamesByPlatform(pFilter);
                    break;

                case "6":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.print("Enter age rating (E / T / M): ");
                    AgeRating aFilter = AgeRating.valueOf(scanner.nextLine().toUpperCase());
                    library.printGamesByAgeRating(aFilter);
                    break;

                case "7":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    System.out.print("Game title: ");
                    Game sg = library.findGameByTitle(scanner.nextLine());

                    if (sg != null) {

                        System.out.print("Date: ");
                        String date = scanner.nextLine();

                        System.out.print("Region: ");
                        String region = scanner.nextLine();

                        System.out.print("Notes: ");
                        String notes = scanner.nextLine();

                        GameSession session = new GameSession(sg, date, region);

                        session.startSession();

                        System.out.println("Session started... press ENTER to end session");
                        scanner.nextLine();

                        session.endSession(notes);

                        library.addSession(session);

                        System.out.println("Session saved!");
                    } else {
                        System.out.println("Game not found.");
                    }

                    break;

                case "8":
                    if (library.getAllSessions().isEmpty()) {
                        System.out.println("No sessions recorded yet.");
                        break;
                    }

                    System.out.println("=== Game Sessions ===");
                    library.printSessionLog();
                    break;

                case "9":
                    if (library.listAllGames().isEmpty()) {
                        System.out.println("No games available.");
                        break;
                    }

                    library.printTopRatedGames();
                    break;

                case "0":
                    running = false;
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid menu number.");
            }
        }

        scanner.close();
    }
}