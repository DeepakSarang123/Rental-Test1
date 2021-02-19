import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test1 {

	public static void main(String[] args) {
		
		
		String dest = "C:\\Users\\40012385\\Documents\\dmp and tar\\Destination";
		System.out.println(dest);
		String repFileName = "6959e49007f1a6b86d2fa34517383ee769e2a_macB827EBF55071_dat2019-10-02-06-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp";
		String name = "dc26959e49007f1a6b86d2fa34517383ee769e29_macB827EBF55071_dat2019-10-02-06-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp";
		
		System.out.println(dest+ "\\" + repFileName+ "\\" + name);
		System.out.println(dest+ "\\" + repFileName+ "\\" + repFileName);
		File inside = new File(dest+ "\\" + repFileName+ "\\" + name);
		File reName = new File(dest+ "\\" + repFileName+ "\\" + repFileName);
		
		
		System.out.println(inside.getPath());
        System.out.println(reName.getPath());
        /*File inside = new File("C:\\Users\\40012385\\Documents\\Test\\New folder\\path.txt");
        File reName = new File("C:\\Users\\40012385\\Documents\\Test\\New folder\\pit.txt");*/
		
		File file1 = new File("C:\\Users\\40012385\\Documents\\dmp and tar\\Destination\\6959e49007f1a6b86d2fa34517383ee769e2c_macB827EBF55071_dat2019-10-02-06-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp\\dc26959e49007f1a6b86d2fa34517383ee769e29_macB827EBF55071_dat2020-10-27-10-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp");
		File file2 = new File("C:\\Users\\40012385\\Documents\\dmp and tar\\Destination\\6959e49007f1a6b86d2fa34517383ee769e2c_macB827EBF55071_dat2019-10-02-06-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp\\6959e49007f1a6b86d2fa34517383ee769e2c_macB827EBF55071_dat2019-10-02-06-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp")	;
		
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		boolean success = inside.renameTo(reName);
		if (!success) {
			System.out.println("Error trying to rename file");
		}else {
			System.out.println("Renaming done");
		}

		
	}

}
