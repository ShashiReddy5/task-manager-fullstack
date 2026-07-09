import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Task, TaskPriority, TaskStatus } from '../models/task.model';

@Injectable({ providedIn: 'root' })
export class TaskService {
  private readonly baseUrl = `${environment.apiUrl}/tasks`;

  constructor(private http: HttpClient) {}

  getAll(): Observable<Task[]> {
    return this.http.get<Task[]>(this.baseUrl);
  }

  getById(id: number): Observable<Task> {
    return this.http.get<Task>(`${this.baseUrl}/${id}`);
  }

  getByStatus(status: TaskStatus): Observable<Task[]> {
    return this.http.get<Task[]>(`${this.baseUrl}/status/${status}`);
  }

  getByPriority(priority: TaskPriority): Observable<Task[]> {
    return this.http.get<Task[]>(`${this.baseUrl}/priority/${priority}`);
  }

  create(task: Task): Observable<Task> {
    return this.http.post<Task>(this.baseUrl, task);
  }

  update(id: number, task: Task): Observable<Task> {
    return this.http.put<Task>(`${this.baseUrl}/${id}`, task);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
