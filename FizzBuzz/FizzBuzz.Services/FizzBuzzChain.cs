using System;

namespace FizzBuzz.Services
{
	public class FizzBuzzChain
	{
		private FizzBuzzChain()
		{
			Head = new FizzBuzzCategorizer();
			Head.RegisterNext(new BuzzCatagorizer())
			    .RegisterNext(new FizzCatagorizer())
			    .RegisterNext(new PlainNumberCatagorizer());
		}

		private BaseHandler Head { get; set; }

		public static string Calculate(int number)
		{
			return _instance.Head.IsSatisfiedBy(number);
		}

		public static readonly FizzBuzzChain _instance = new FizzBuzzChain();
	}
}
