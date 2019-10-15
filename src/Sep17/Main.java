package Sep17;

class CardDeck {

	public String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	public String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	public String[] deck = new String[52];

	public String getIdentificationString()

	{

		return "Program 2b, firstname lastname";

	}

	public CardDeck()

	{

		int k = 0;

		for (int i = 0; i < suits.length; i++)

			for (int j = 0; j < ranks.length; j++)

			{

				deck[k++] = ranks[j] + " of " + suits[i];

			}

	}

	public String getCard(int index)

	{

		return deck[index - 1];

	}

	public String getFirst()

	{

		return deck[0];

	}

	public String getLast()

	{

		return deck[51];

	}

	public String royalFlush()

	{

		String royal = "Royal Flushes are: \n";

		int i, j;

		for (i = 0; i < suits.length; i++)

		{

			for (j = 8; j < ranks.length - 1; j++)

			{

				royal += deck[j + (i * 13)] + ", ";

			}

			royal += deck[j + (i * 13)] + "\n";

		}

		return royal;

	}

	public static void main(String[] args) {

		CardDeck C = new CardDeck();

		System.out.println(C.getIdentificationString());

		System.out.println(C.getCard(2));

		System.out.println(C.getCard(43));

		System.out.println(C.getFirst());

		System.out.println(C.getLast());

		System.out.println(C.royalFlush());

	}
}
