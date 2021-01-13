package lambdaExprOnCollections;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		// if (I1 > I2) {
		// // In desceding ordwer if I1 is greater than I2 then I1 must be
		// // placed first/before I2
		// // thats means for this above condition return -1
		// return -1;
		//
		// } else if (I1 < I2) {
		// return 1;
		// } else {
		// // if both I1 and I2 are equal
		// return 0;
		// }
		// }

		// this above can written as conditional operator
		return (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0;

		// (I1 > I2) ? -1 =>> means if(I1>I2) then return -1
		// : means else
		// (I1 < I2) ? 1 ? -1 =>> means if(I1<I2) then return 1

		// we can concatenate multiple conditions like else statement using : in
		// conditional operator
	}
}
