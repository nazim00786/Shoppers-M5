package Utilities;

public class DataUtility {
	public String dataFromPropertiesFile(String key) throws Throwable {
		File file = new File(IPathInstant.propertiesPath);
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}

	public String dataFromExcelFile(String SheetName, int RowNum, int colNum) throws Throwable {
		File file = new File(IPathInstant.ExcelPath);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(RowNum);
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(row.getCell(colNum));

		return value;

		// Today some Data Utility
	}

	public Object[][] accessAllAddress() throws Throwable {
		Object[][] ref = new Object[1][9];

		System.out.println("second test case");
		File file = new File(IPathInstant.ExcelPath);

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet");

		DataFormatter form = new DataFormatter();

		int count = 8;

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			for (int j = 0; j <= sheet.getLastRowNum(); j++) {
				ref[count][j] = form.formatCellValue(sheet.getRow(i).getCell(j)).toString();

			}
			count++;
		}
		return ref;

	}


}
