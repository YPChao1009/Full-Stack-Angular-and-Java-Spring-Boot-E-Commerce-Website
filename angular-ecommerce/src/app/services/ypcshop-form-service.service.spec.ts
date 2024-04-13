import { TestBed } from '@angular/core/testing';

import { YPCShopFormServiceService } from './ypcshop-form-service.service';

describe('YPCShopFormServiceService', () => {
  let service: YPCShopFormServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(YPCShopFormServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
