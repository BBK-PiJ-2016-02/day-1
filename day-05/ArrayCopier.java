public class ArrayCopier {
	public void copy(int[] src, int[] dst) {
		for(int i = 0; i < dst.length; i++) {
			if(src.length > i) {
				dst[i] = src[i];
			} else {
				dst[i] = 0;
			}
		}
	}
}