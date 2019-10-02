/**
 * Henry Vy
 * JukeBox class that will create a jukebox to play music
 */

import java.util.LinkedList;
import java.util.Queue;

public class JukeBox 
{
	private Queue<String> songQueue = new LinkedList();
	private static JukeBox jukeBox;
	
	private JukeBox() {}
	
	/**
	 * This method will get the existing jukebox or create one
	 * if there is none
	 * @return
	 */
	public static JukeBox getInstance()
	{
		if (jukeBox == null)
		{
			System.out.println("Initializing the JukeBox!!! Let's get Dancing");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	
	/**
	 * This method will play the next song in the queue
	 */
	public void playNextSong()
	{
		System.out.println("Let's jam to " + songQueue.remove());
	}
	
	/**
	 * This method passes in a song name and will add it to the queue.
	 * @param song
	 */
	public void requestSong(String song)
	{
		songQueue.add(song);
		System.out.println(song + " is now number " + songQueue.size() + " on the list");
	}
	
	/**
	 * This is a boolean method that will be used to check if the queue is 
	 * empty or not
	 * @return
	 */
	public boolean hasMoreSongs()
	{
		if (songQueue.isEmpty())
			return false;
		
		return true;
	}
}
