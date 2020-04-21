package util;

public class EclEmmaSample {
	public static int ucln(int soThuNhat, int soThuHai) {
		if (soThuHai == 0) {
			return soThuNhat;
		}

		if (soThuNhat == 0) {
			return soThuHai;
		}

		if (soThuHai > soThuNhat) {
			return ucln(soThuNhat, soThuHai % soThuNhat);
		}

		return ucln(soThuHai, soThuNhat % soThuHai);
	}

	public static int bcnn(int soThuNhat, int soThuHai) {
		return (soThuNhat * soThuHai) / ucln(soThuNhat, soThuHai);
	}
}
