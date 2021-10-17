using Microsoft.VisualStudio.TestTools.UnitTesting;
using FizzBuzz.Services;

namespace FizzBuzzTest
{
	[TestClass]
	public class TestFizzBuzz
	{
		[DataTestMethod]
		[DataRow(5, "Buzz")]
		[DataRow(3, "Fizz")]
		[DataRow(15, "FizzBuzz")]
		[DataRow(7, "7")]
		public void TestFizzBuzzCode(int actual, string expected)
		{
			var sut = new FizzBuzzCalc();
			string result = sut.Calculate(actual);
			Assert.AreEqual(expected, result);
		}
	}
}
