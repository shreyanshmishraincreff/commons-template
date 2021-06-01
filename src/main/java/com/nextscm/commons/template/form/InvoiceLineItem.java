/*
 * Copyright (c) 2021. Increff
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.nextscm.commons.template.form;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceLineItem {
	private String vendorSku;
	private String channelSku;
	private String itemName;
	private double mrp;
	private int quantity;
	private String hsnId;
	private double baseSellingPricePerUnit;
	private double baseSellingPriceTotal;
	private double netTaxAmountTotal;
	private double actualSellingPriceTotal;

	private List<TaxRateLineItem> subTaxItemData;

}