package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.*;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		File srcDir = new File("/home/luck/Downloads/ForFirstLab/");
		File destDir = new File("/home/luck/Downloads/Result/");

		IOFileFilter f1 = new IOFileFilter() {
			
			public boolean accept(File file) {
				return true;
			}
			
			public boolean accept(File dir, String name) {
				return true;
			}
		};
	
		assertTrue(myCompare(FileUtils.listFilesAndDirs(destDir, f1, f1),FileUtils.listFilesAndDirs(srcDir, f1, f1)));
	}
	
	boolean myCompare(Collection<File> a, Collection<File> b)
	{
		Iterator<File> ita = a.iterator();
		Iterator<File> itb = b.iterator();
		ita.next();
		ita.remove();
		itb.next();
		itb.remove();
		if (a.size() != b.size())
		{
			return false;
		}
		for (File f1:a)
		{
			boolean finded = false;
			for (File f2:b)
			{
				String name1 = f1.getName(), name2 = f2.getName();
				if(name1.equals(name2))
						{
							finded = true;
						}
			}
			if (!finded)
			{
				return false;
			}
		}
		return true;
	}
}
