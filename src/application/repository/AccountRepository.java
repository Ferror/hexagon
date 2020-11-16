package application.repository;

import domain.Account;
import domain.account.Identifier;

public interface AccountRepository
{
    Account find(Identifier identifier);
}
