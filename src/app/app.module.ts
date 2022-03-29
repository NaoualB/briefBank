import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AuthComponent } from './auth/auth.component';
import { ListAccountsComponent } from './list-accounts/list-accounts.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { UpdateAccountComponent } from './update-account/update-account.component';
import { UpdateAccountEpargneComponent } from './update-account-epargne/update-account-epargne.component';
import { ListClientsComponent } from './list-clients/list-clients.component';
import { CreditAccountComponent } from './credit-account/credit-account.component';
import { TransferAccountComponent } from './transfer-account/transfer-account.component';
import { DebitAccountComponent } from './debit-account/debit-account.component';
import { ModifyAccountComponent } from './modify-account/modify-account.component';
import { DeleteAccountComponent } from './delete-account/delete-account.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    ListAccountsComponent,
    AccountDetailsComponent,
    UpdateAccountComponent,
    UpdateAccountEpargneComponent,
    ListClientsComponent,
    CreditAccountComponent,
    TransferAccountComponent,
    DebitAccountComponent,
    ModifyAccountComponent,
    DeleteAccountComponent
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
