import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.development';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent implements OnInit {

  name = "test name";
  data = "";
  followers = 0;
  following = 0;

  constructor(
    private httpClient: HttpClient,
    private router: Router,
    private activatedRoute: ActivatedRoute
    ) { }

  ngOnInit(): void {
    this.activatedRoute.queryParams.subscribe(params => {
      this.name = params['name'];
    });
    this.requestBackend();
  }

  requestBackend() {
    const data = {name: this.name};
    const body = JSON.stringify(data);
    this.httpClient.post<any>(
      environment.backendUrl + "/user/data",
      body,
      {
        headers: {
          'Content-Type': 'application/json'
        }
      }).subscribe(
        {
          next: ((response: any) => {
            console.log(response);
            console.log(response.data);
            this.data = response.data;
            this.followers = response.followers;
            this.following = response.following;
          }),
          error: (error => {
                console.log(error);
              })
        }
      )
  }

  logout() {
    this.router.navigate(['/logout']);
  }

}
