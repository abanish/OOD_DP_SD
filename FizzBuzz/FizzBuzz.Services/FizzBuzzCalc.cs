using System;

namespace FizzBuzz.Services
{
	public class FizzBuzzCalc
	{
		public string Calculate(int number)
		{
			return FizzBuzzChain.Calculate(number);
		}
	}

	public class ProcessCalculate
	{
		public void Execute()
		{
			var fb = new FizzBuzzCalc();
			for (int index = 1; index <= 100; index++)
			{
				Console.WriteLine(fb.Calculate(index));
			}
		}
	}
}