namespace FizzBuzz.Services
{
	public abstract class BaseHandler
	{
		protected BaseHandler Next { get; private set; }
		public abstract string IsSatisfiedBy(int number);

		public BaseHandler RegisterNext(BaseHandler next)
		{
			Next = next;
			return Next;
		}
	}
}