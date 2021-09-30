package com.kumgan.finplan.repo;

import com.kumgan.finplan.models.ExpenseItemModel;
import org.springframework.data.repository.CrudRepository;

public interface  ExpenseRepo  extends CrudRepository<ExpenseItemModel,Long> {
}
