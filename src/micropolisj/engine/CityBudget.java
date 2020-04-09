// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.engine;

public class CityBudget
{
	private final Micropolis city;

	/**
	 * The amount of cash on hand.
	 */
	public int totalFunds;

	/**
	 * Amount of taxes collected so far in the current financial
	 * period (in 1/TAXFREQ's).
	 */
	int taxFund;

	/**
	 * Amount of prepaid road maintenance (in 1/TAXFREQ's).
	 */
	int roadFundEscrow;

	/**
	 * Amount of prepaid fire station maintenance (in 1/TAXFREQ's).
	 */
	int fireFundEscrow;

	/**
	 * Amount of prepaid police station maintenance (in 1/TAXFREQ's).
	 */
	int policeFundEscrow;
	
	/**
	 * Amount of extra income from tax collected annually.
	 */
	
	int extraIncome = 0;
	
	/**
	 * Amount of tax that fails to be collected annually.
	 */
	int negIncome = 0;
	
	/**
	 * Whether there is any citizen paying for the entire year's rail/road maintenance fee (trans. fund) in this year.
	 */
	boolean specialPos = false;
	
	/**
	 * Whether the entire citizen body refuses to pay tax in this year.
	 */
	boolean specialNeg = false;

	CityBudget(Micropolis city)
	{
		this.city = city;
	}
}
