#include "PrimeNumber.h"



bool PrimeNumber::isPrimeNumber(int number)
{
	if (number <= 1)
		return false;

	for (int i = 2; i < number; i++)
	{
		if (number % i == 0)
			return false;
	}

	return true;
}

PrimeNumber::PrimeNumber()
{
}


PrimeNumber::~PrimeNumber()
{
}
