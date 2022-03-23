import java.util.Random;

public class Joke {

static Random r = new Random();
public static String joke() {
	
	
	
	
	String[] sarcasm = {"You should take my advice because I'm not dumb enough to do so!", 
			 "If you need more space, there is NASA.",
			 "What do you say when people accuse you of lying? You say, \"I just write fiction with my mouth!",
			 "How do you know that light travels faster than sound? A lot of people seem bright until they talk.",
			 "Why is intelligence like underwear? Because it's crucial that you have it but not mandatory that you show it off!",
			 "Why are relationships like algebra? Because you look at your X and wonder Y?",
			 "If ignorance is bliss, I am the happiest person on Earth.",
			 "If laughter is the best medicine, then your face might be healing the world.",
			 "Since zombies feed on brains, it looks like you're safe.",
			 "A recent study has found that the women who carry a bit of \nextra weight live longer compared to the men who mention it.",
			 "How can an apple a day keep the doctor away? If you throw it hard enough!",
			 "Do you know why I had a bad day? My ex was run over by a bus and I got fired from my job as a bus driver!",
			 "Why is alcohol the perfect solvent? It dissolves careers, families, and relationships.",
			 "Not all men are annoying. Some are dead.",
			 "If you’re here, who’s running hell?",
			 "I can totally keep secrets. It’s the people I tell them to who can’t.",
			 "If I promise to miss you, will you go, like, really far away?"
			,"You're not the dumbest person on the planet, but you sure better hope he doesn't die",
			"Roses are red the sky is blue. I mind my own business, why don't you?!",
			"1988: \n \"Don't get in car with strangers\" \n 2008: \n \"Don't meet people from internet alone.\"  \n 2019: \n \"Order yourself a stranger from the internet to get into a car alone\""
     , "don’t regret doing things, regret getting caught",
     "Dear Lord, there is a bug in your software.\nit’s called #Monday, please fix it...",
     "Dear Lord: The gods have been good to me.\n For the first time in my life, everything is absolutely perfect just the way it is. So here’s the deal: You freeze everything the way it is, and I won’t ask for anything more. If that is OK, please give me absolutely no sign. OK, deal. In gratitude, I present you this offering of cookies and milk. If you want me to eat them for you, give me no sign. Thy will be done."
,"If you can smile when things go wrong, you have someone in mind to blame.",
"THANKS TO YOU I have learned that my prayers only get answered if I forward an e-mail to seven of my friends and make a wish within five minutes.",
"Waitress: ’Do u have any questions about the menu?’\r\n"
+ "Me: ’What kind of font is this?",
"Friends buy you food. Best friends eat your food.\r\n"
+ "\r\n","Good friends don't let their friends do stupid stuff alone.",
"Never let you best friends get lonely. Keep annoying them."
,"True friends don't just each other. They judge other people together.",
"If you have crazy friends you have everything that you'll ever need.",
"You and I aren't friends. We are our own small gang.\r\n"
,"When our phones fall we panic. When our friends fall, we laugh.",
"Best friends know how stupid and crazy you are, but will still be seen in public with you.",
"A true friend: Someone who asks for your advice, and does the complete opposite.",
"When I said how stupid you can be, it wasn't a challenge.",
"You suck less than most people.",
"A friend will help you up when you fall down. A best friend will laugh at you so much they'll fall down too.",
"Everybody has the right to be stupid. But you're abusing the privilege."
,"Friends cheer you up with comforting words. Best friends cheer you up with sarcasm.",
"Find your patience before I lose mine.",
"I am busy right now, can I ignore you some other time?",
"Cancel my subscription because I don’t need your issues.",
"Police : Where do you live? \n Me : With my parents \n Police : Where do your parents live? \n Me : With me \n Police : Where do you all live? \n Me : Together \n Police : Where is your house? \n Me : Next to my neighbors house \n Police : Where is your neighbors house? \n Me : If i tell you, you wont believe me. \n Police : Tell me \n Me : Next to my house ",
"Teacher : “Anyone who thinks they are stupid may stand up!” \n * Nobody stands up* \nTeacher : “I'm sure there are some stupid students over here!!” \n*Little Johnny stands up* \nTeacher : “Ohh, Johnny you think you're stupid?” \nLittle Johnny : “No… i just feel bad that you're standing alone…”  ",
"What happened when two vampires went on a blind date? It was love at first bite!",
"Two blondes were going to Disneyland when they came to a fork in the road. \nThe sign read: \"Disneyland Left.\" "
};
	int n = r.nextInt(0,sarcasm.length);	
	return (sarcasm[n]);
	
}

public static String quote() {
	String arr[]= {
			"“Coincidence can be freaky.”\r - ayanokoji\n",
			"“I’ve never once thought of you as an ally. Not you. \nNot Kushida. Not Hirata. All people are nothing but tools.\n It doesn’t matter how its done. \n It doesn’t matter what needs to be sacrificed.\n In this world, winning is everything.\n  As long as I win in the end…That’s all that matters.”"
			,"“The purpose of our lives is to be happy.” — Dalai Lama",
			" “Get busy living or get busy dying.” — Stephen King",
			"“You only live once, but if you do it right, once is enough.” — Mae Wes",
			"If you want to live a happy life, tie it to a goal, not to people or things.”– Albert Einstein",
			"\"I believe we are here on the planet Earth to live,\n grow up and do what we can to make this world a better place for all people to enjoy freedom.\" -Rosa Parks",
			"\"Being happy never goes out of style.\"",
			"\"Life is either a great adventure or nothing.\" -Helen Keller",
			"\"You are the sum total of everything you've ever seen, heard, eaten, smelled, been told, \nforgot - it's all there. Everything influences each of us, and because of that I try to make \nsure that my experiences are positive.\" Maya Angelou"
			,"All you need in this life is ignorance and confidence; then success is sure.\" "
	};
	return arr[r.nextInt(0,arr.length)];
}
}
