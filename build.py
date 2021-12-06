import docker
from pathlib import Path
import os

ROOT = Path(os.getcwd())
IGNORED = ["docs"]
print(ROOT)
USERNAME = "henrylao"
BUILD = "latest"

client = docker.from_env()
print(client.containers.list())

# target directories w/ Dockerfile
ROOT_DIRS = [ str(ROOT / _) for _ in os.listdir(ROOT) if os.path.isdir(ROOT / _) and "." not in _ and _ not in IGNORED]
print("\n".join(ROOT_DIRS))
BASENAMES = [  _.lower() for _ in os.listdir(ROOT) if os.path.isdir(ROOT / _) and "." not in _ and _ not in IGNORED]

print(BASENAMES)
for base in BASENAMES:
    p = ROOT / base
    image = client.images.build(
        path = p,
        quiet = False,
        target=base
    )
    client.image.push(
        repository=f"{USERNAME}/{p}:" + BUILD
    )
# 
#for dir in ROOT_DIRS:

#    client.images.build(
#        path=dir
#    )



