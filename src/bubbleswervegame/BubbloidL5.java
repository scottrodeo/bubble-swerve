package bubbleswervegame;
import java.awt.Color;

/**
 * @author https://scott.rodeo/
 */

public class BubbloidL5 extends AbstractBubbloid {

	public static int[] rowOffset= {-1,0,1,2,2,9};
	public static int[] colOffset= {0,0,0,0,1,9};
	
	public BubbloidL5(int initialRow, int initialColumn, Grid grid) {
		super(initialRow, initialColumn, grid, limeGreen, rowOffset, colOffset);
	}
}
