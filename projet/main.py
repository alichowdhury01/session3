#Newtonian Gravity Simulator
#By: @TheRealMentos

import pygame
import math
import random
import time
import sys
import os
import numpy as np
import matplotlib.pyplot as plt
from pygame.locals import *

#Constants
G = 6.67408e-11
AU = 149597870700
M = 1.989e30
FPS = 60
WIDTH = 800
HEIGHT = 600
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)
YELLOW = (255, 255, 0)
ORANGE = (255, 165, 0)
PURPLE = (128, 0, 128)
CYAN = (0, 255, 255)
MAGENTA = (255, 0, 255)
BROWN = (165, 42, 42)
GREY = (128, 128, 128)
DARKGREY = (64, 64, 64)
LIGHTGREY = (192, 192, 192)
LIGHTBLUE = (0, 191, 255)
LIGHTGREEN = (144, 238, 144)
LIGHTRED = (255, 102, 102)
LIGHTYELLOW = (255, 255, 102)
LIGHTORANGE = (255, 165, 0)
LIGHTPURPLE = (128, 0, 128)
LIGHTCYAN = (0, 255, 255)
LIGHTMAGENTA = (255, 0, 255)
LIGHTBROWN = (165, 42, 42)
LIGHTGREY = (128, 128, 128)
DARKGREY = (64, 64, 64)
LIGHTGREY = (192, 192, 192)
LIGHTBLUE = (0, 191, 255)
LIGHTGREEN = (144, 238, 144)
LIGHTRED = (255, 102, 102)
LIGHTYELLOW = (255, 255, 102)   
LIGHTORANGE = (255, 165, 0)
LIGHTPURPLE = (128, 0, 128)
LIGHTCYAN = (0, 255, 255)
LIGHTMAGENTA = (255, 0, 255)
LIGHTBROWN = (165, 42, 42)

#Initialise Pygame
pygame.init()
pygame.display.set_caption("Newtonian Gravity Simulator")
screen = pygame.display.set_mode((WIDTH, HEIGHT))
clock = pygame.time.Clock()

#Initialise Fonts
pygame.font.init()
font = pygame.font.SysFont('Arial', 20)

#Initialise Sounds
#Initialise Images
sun = LIGHTBROWN
mercury = LIGHTBROWN
venus = LIGHTBROWN
earth = LIGHTBROWN
mars = LIGHTBROWN
jupiter = LIGHTBROWN
saturn = LIGHTBROWN
uranus = LIGHTBROWN
neptune = LIGHTBROWN
pluto = LIGHTBROWN
asteroid =LIGHTBROWN
comet = LIGHTBROWN
star = LIGHTBROWN
planet = LIGHTBROWN
moon = LIGHTBROWN

#Initialise Variables
running = True
paused = False
show_trail = True
show_orbit = True
show_velocity = True
show_acceleration = True
show_mass = True
show_name = True
show_distance = True
show_time = True
show_fps = True
show_help = True
show_info = True
show_planets = True
show_moons = True
show_asteroids = True
show_comets = True
show_stars = True
show_sun = True
show_mercury = True
show_venus = True
show_earth = True
show_mars = True
show_jupiter = True
show_saturn = True
show_uranus = True
show_neptune = True
show_pluto = True
show_planet = True
show_moon = True
show_asteroid = True
show_comet = True
show_star = True

#Initialise Planets
class Planet:

    def __init__(self, name, mass, radius, x, y, vx, vy, colour, image):
        self.name = name
        self.mass = mass
        self.radius = radius
        self.x = x
        self.y = y
        self.vx = vx
        self.vy = vy
        self.colour = colour
        self.image = image

    def update(self, dt):
        self.x += self.vx * dt
        self.y += self.vy * dt

    def draw(self):
        screen.blit(self.image, (self.x - self.radius, self.y - self.radius))

    def draw_trail(self):
        pygame.draw.circle(screen, self.colour, (int(self.x), int(self.y)), 1)

    def draw_orbit(self):
        pygame.draw.circle(screen, self.colour, (int(self.x), int(self.y)), int(self.radius), 1)

    def draw_velocity(self):
        pygame.draw.line(screen, self.colour, (self.x, self.y), (self.x + self.vx, self.y + self.vy), 1)

    def draw_acceleration(self):
        pygame.draw.line(screen, self.colour, (self.x, self.y), (self.x + self.ax, self.y + self.ay), 1)

    def draw_mass(self):
        text = font.render(str(self.mass), True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_name(self):
        text = font.render(self.name, True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_distance(self):
        text = font.render(str(round(self.distance, 2)), True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_time(self):
        text = font.render(str(round(self.time, 2)), True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_fps(self):
        text = font.render(str(round(self.fps, 2)), True,
                            self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_help(self):
        text = font.render("Press 'P' to pause", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_info(self):
        text = font.render("Press 'I' for info", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_planets(self):
        text = font.render("Press '1' to show planets", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_moons(self):
        text = font.render("Press '2' to show moons", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_asteroids(self):
        text = font.render("Press '3' to show asteroids", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_comets(self):
        text = font.render("Press '4' to show comets", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_stars(self):
        text = font.render("Press '5' to show stars", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_sun(self):
        text = font.render("Press '6' to show sun", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_mercury(self):
        text = font.render("Press '7' to show mercury", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_venus(self):
        text = font.render("Press '8' to show venus", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_earth(self):
        text = font.render("Press '9' to show earth", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_mars(self):
        text = font.render("Press '0' to show mars", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_jupiter(self):
        text = font.render("Press '-' to show jupiter", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_saturn(self):
        text = font.render("Press '=' to show saturn", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_uranus(self):
        text = font.render("Press '[' to show uranus", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_neptune(self):
        text = font.render("Press ']' to show neptune", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_pluto(self):
        text = font.render("Press '\\' to show pluto", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_pluto(self):
        text = font.render("Press '\\' to show pluto", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)

    def draw_moon(self):
        text = font.render("Press ';' to show moon", True, self.colour)
        text_rect = text.get_rect()
        text_rect.center = (self.x, self.y)
        screen.blit(text, text_rect)


class Planet:
    def __init__(self, x, y, radius, colour, orbit_radius, orbit_speed):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour
        self.orbit_radius = orbit_radius
        self.orbit_speed = orbit_speed
        self.angle = 0

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)

    def draw_orbit(self):
        pygame.draw.circle(screen, (255, 255, 255), (self.x, self.y), self.orbit_radius, 1)

    def update(self):
        self.angle += self.orbit_speed
        self.x = int(self.orbit_radius * math.cos(self.angle)) + self.x
        self.y = int(self.orbit_radius * math.sin(self.angle)) + self.y


class Moon:
    def __init__(self, x, y, radius, colour, orbit_radius, orbit_speed):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour
        self.orbit_radius = orbit_radius
        self.orbit_speed = orbit_speed
        self.angle = 0

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)

    def draw_orbit(self):
        pygame.draw.circle(screen, (255, 255, 255), (self.x, self.y), self.orbit_radius, 1)

    def update(self):
        self.angle += self.orbit_speed
        self.x = int(self.orbit_radius * math.cos(self.angle)) + self.x
        self.y = int(self.orbit_radius * math.sin(self.angle)) + self.y


class Comet:
    def __init__(self, x, y, radius, colour, orbit_radius, orbit_speed):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour
        self.orbit_radius = orbit_radius
        self.orbit_speed = orbit_speed
        self.angle = 0

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)

    def draw_orbit(self):
        pygame.draw.circle(screen, (255, 255, 255), (self.x, self.y), self.orbit_radius, 1)

    def update(self):
        self.angle += self.orbit_speed
        self.x = int(self.orbit_radius * math.cos(self.angle)) + self.x
        self.y = int(self.orbit_radius * math.sin(self.angle)) + self.y


class Asteroid:
    def __init__(self, x, y, radius, colour, orbit_radius, orbit_speed):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour
        self.orbit_radius = orbit_radius
        self.orbit_speed = orbit_speed
        self.angle = 0

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)

    def draw_orbit(self):
        pygame.draw.circle(screen, (255, 255, 255), (self.x, self.y), self.orbit_radius, 1)

    def update(self):
        self.angle += self.orbit_speed
        self.x = int(self.orbit_radius * math.cos(self.angle)) + self.x
        self.y = int(self.orbit_radius * math.sin(self.angle)) + self.y


class Sun:
    def __init__(self, x, y, radius, colour):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)


class BlackHole:
    def __init__(self, x, y, radius, colour):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)


class Star:
    def __init__(self, x, y, radius, colour):
        self.x = x
        self.y = y
        self.radius = radius
        self.colour = colour

    def draw(self):
        pygame.draw.circle(screen, self.colour, (self.x, self.y), self.radius)



def main(): 
    global screen
    pygame.init()
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Solar System")
    clock = pygame.time.Clock()
    running = True

    sun = Sun(WIDTH // 2, HEIGHT // 2, 50, (255, 255, 0))
    black_hole = BlackHole(WIDTH // 2, HEIGHT // 2, 50, (0, 0, 0))
    star = Star(WIDTH // 2, HEIGHT // 2, 50, (255, 255, 255))
    mercury = Planet(WIDTH // 2, HEIGHT // 2, 5, (255, 255, 255), 100, 0.1)
    venus = Planet(WIDTH // 2, HEIGHT // 2, 10, (255, 255, 255), 150, 0.08)
    earth = Planet(WIDTH // 2, HEIGHT // 2, 10, (0, 0, 255), 200, 0.06)
    mars = Planet(WIDTH // 2, HEIGHT // 2, 7, (255, 0, 0), 250, 0.05)
    jupiter = Planet(WIDTH // 2, HEIGHT // 2, 20, (255, 255, 255), 300, 0.04)
    saturn = Planet(WIDTH // 2, HEIGHT // 2, 15, (255, 255, 255), 350, 0.03)
    uranus = Planet(WIDTH // 2, HEIGHT // 2, 15, (255, 255, 255), 400, 0.02)
    neptune = Planet(WIDTH // 2, HEIGHT // 2, 15, (255, 255, 255), 450, 0.01)
    pluto = Planet(WIDTH // 2, HEIGHT // 2, 5, (255, 255, 255), 500, 0.005)
    moon = Moon(WIDTH // 2, HEIGHT // 2, 5, (255, 255, 255), 50, 0.2)
    comet = Comet(WIDTH // 2, HEIGHT // 2, 5, (255, 255, 255), 50, 0.2)
    asteroid = Asteroid(WIDTH // 2, HEIGHT // 2, 5, (255, 255, 255), 50, 0.2)

    while running:
        clock.tick(FPS)
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

        screen.fill((0, 0, 0))

        sun.draw()
        black_hole.draw()
        star.draw()
        mercury.draw_orbit()
        mercury.draw()
        mercury.update()
        venus.draw_orbit()
        venus.draw()
        venus.update()
        earth.draw_orbit()
        earth.draw()
        earth.update()
        mars.draw_orbit()
        mars.draw()
        mars.update()
        jupiter.draw_orbit()
        jupiter.draw()
        jupiter.update()
        saturn.draw_orbit()
        saturn.draw()
        saturn.update()
        uranus.draw_orbit()
        uranus.draw()
        uranus.update()
        neptune.draw_orbit()
        neptune.draw()
        neptune.update()
        pluto.draw_orbit()
        pluto.draw()
        pluto.update()
        moon.draw_orbit()
        moon.draw()
        moon.update()
        comet.draw_orbit()
        comet.draw()
        comet.update()
        asteroid.draw_orbit()
        asteroid.draw()
        asteroid.update()

        pygame.display.flip()

    pygame.quit()

    