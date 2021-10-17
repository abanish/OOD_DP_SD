namespace FizzBuzz.Services
{
	public class FizzBuzzCategorizer : BaseHandler
	{
		public override string IsSatisfiedBy(int number)
		{
			if (number % 15 == 0)
				return "FizzBuzz";
			return Next.IsSatisfiedBy(number);
		}
	}
	public class BuzzCatagorizer : BaseHandler
	{
		public override string IsSatisfiedBy(int number)
		{
			if (number % 5 == 0)
				return "Buzz";
			return Next.IsSatisfiedBy(number);
		}
	}
	public class FizzCatagorizer : BaseHandler
	{
		public override string IsSatisfiedBy(int number)
		{
			if (number % 3 == 0)
				return "Fizz";
			return Next.IsSatisfiedBy(number);
		}
	}
	public class PlainNumberCatagorizer : BaseHandler
	{
		public override string IsSatisfiedBy(int number)
		{
			return number.ToString();
		}
	}
}